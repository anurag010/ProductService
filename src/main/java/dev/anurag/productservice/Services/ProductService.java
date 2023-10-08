package dev.anurag.productservice.Services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import dev.anurag.productservice.ThirdPartyClient.ProductServiceClient.FakeStoreClient.FakeStoreProductDTO;
import dev.anurag.productservice.dtos.GenericProductDTO;
import dev.anurag.productservice.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {

    GenericProductDTO createProduct(GenericProductDTO product);

    GenericProductDTO getProductyId(Long id) throws Exception;
    List<GenericProductDTO> getAllProducts();

    GenericProductDTO updateProductById(Long id,GenericProductDTO product);

    GenericProductDTO deteleProduct(Long id);

    List<String> getAllCategories();

    List<GenericProductDTO> getByCategory(String category);
}
