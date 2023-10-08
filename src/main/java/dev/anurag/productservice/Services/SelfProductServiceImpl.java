package dev.anurag.productservice.Services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.anurag.productservice.ThirdPartyClient.ProductServiceClient.FakeStoreClient.FakeStoreProductDTO;
import dev.anurag.productservice.dtos.GenericProductDTO;

import java.util.List;

@Service("SelfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{

    @Override
    public GenericProductDTO createProduct(GenericProductDTO product) {
        return null;
    }

    @Override
    public GenericProductDTO getProductyId(Long id) {
        return null;
    }

    @Override
    public List<GenericProductDTO> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDTO updateProductById(Long id,GenericProductDTO product) {
        return null;
    }

    @Override
    public GenericProductDTO deteleProduct(Long id) {
        return null;
    }

    @Override
    public List<String> getAllCategories() {
        return null;
    }

    @Override
    public List<GenericProductDTO> getByCategory(String category) {
        return null;
    }
}
