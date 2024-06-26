package com.bytekeeper.backend.model.DTO;

import com.bytekeeper.backend.model.Product;
import com.bytekeeper.backend.model.User;

import java.util.List;

public class InventoryDTO {
    private Long id;
    public String name;
    public String visibility;
    private List<ProductDTO> products;
    private UserDTO user;
    private Long userId;

    public InventoryDTO(Long id, String name, List<ProductDTO> products, String viz, Long userId) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.visibility = viz;
        this.userId = userId;
    }

    public InventoryDTO() {
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

}
