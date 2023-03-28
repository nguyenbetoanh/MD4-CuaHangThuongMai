package ra.payload.response;

import lombok.Data;
import ra.model.entity.Catalog;
import ra.model.entity.Product;
import ra.model.entity.ProductDetail;

import java.util.ArrayList;
import java.util.List;

@Data
public class DisplayProduct {
   private int productId;
   private String productName;
   private boolean productStatus;
   private Catalog catalog;
   private int productAvailable;
   private float stars;
   private List<ProductDetailResponse> listProductDetail = new ArrayList<>();
   private List<FeedBackResponse> listFeedBack = new ArrayList<>();
}
