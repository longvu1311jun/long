package demo_1Bang.service;

import demo_1Bang.domainmodel.Category;
import demo_1Bang.repository.CategoryRepository;
import java.util.List;

/**
 *
 * @author DELL
 */
public class CateServiceImpl implements CateService{
private CategoryRepository cr = new CategoryRepository();
    @Override
    public List<Category> getAllCate() {
        return cr.getAll();
    }
    
}
