package demo_1Bang.repository;

import demo_1Bang.domainmodel.Category;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CategoryRepository {

    public List<Category> getAll() {
        String query = """
                       SELECT [id]
                             ,[category_code]
                             ,[category_name]
                         FROM [dbo].[category]
                       """;
        try ( Connection con = DBConnect.getConnection();  
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<Category> lists = new ArrayList<>();
            while (rs.next()) {
                Category category
                        = new Category(rs.getLong(1),
                                rs.getString(2),
                                rs.getString(3));
                lists.add(category);

            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public Category  getOne(Long id) {
        String query = """
                       SELECT [id]
                             ,[category_code]
                             ,[category_name]
                         FROM [dbo].[category]
                       WHERE id = ?
                       """;
        try ( Connection con = DBConnect.getConnection();  
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Category category
                        = new Category(rs.getLong(1),
                                rs.getString(2),
                                rs.getString(3));
                return category;

            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        List<Category> lists = new CategoryRepository().getAll();
        for (Category c : lists) {
            System.out.println(c.toString());
        }
    }
}
