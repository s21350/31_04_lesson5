package com.company;

public class busket {
    User user;
    Product[] products;
    int NumOfProducts = 0;
    double price = 0;

    public busket(User user) {
        this.user = user;
    }

    public busket(User user, Product[] products) {
        this.user = user;
        this.products = products;
    }

    public void addProduct(Product product){
        if(products == null) products = new Product[1];
        if(products.length <= NumOfProducts) {
            Product[] productsCopy = new Product[NumOfProducts+1];
            for(int i=0; i < products.length; i++){
                productsCopy[i] = products[i];
            }
            products = productsCopy;
        }
        products[NumOfProducts++]=product;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void buy(){
        if(products == null){
            System.out.println("The busket is empty");
        }else {
            for (int i = 0; i < products.length; i++) {

                if(products[i] == null){
                    price += 0;
                }else{
                    price += products[i].price;
                }
            }
            System.out.println("Sum: " + price);
        }
    }


    public void deleteProduct(Product product) {
        boolean isChange = false;

        for (int i = 0; i < products.length; i++) {

            if (products[i] != null && products[i].name.equals(product.name)) {
                products[i] = null;
                isChange = true;
            }
        }
        if (isChange == true) {
            int counterOfproductsCopy = 0;
            Product[] productsCopy = new Product[products.length - 1];

            for (int i = 0; i < products.length; i++) {
                if (products[i] != null) {
                    productsCopy[counterOfproductsCopy++] = products[i];
                }
            }
            products = productsCopy;
        }

    }
}
