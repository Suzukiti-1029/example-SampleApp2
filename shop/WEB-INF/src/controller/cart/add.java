package controller.cart;

import java.io.IOException;

import controller.servletBase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CartService;

@WebServlet("/cart/add")
public class add extends servletBase {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    super.doGet(request, response);
    CartService cartService = new CartService(request);
    cartService.addItemToCart();

    redirect("index");
  }
}
