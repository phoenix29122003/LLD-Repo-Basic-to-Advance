package DesignPatterns.StructuralDesignPattern.FacadeDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        InventoryService inventoryService=new InventoryService();
        PaymentService paymentService=new PaymentService();
        ShippingService shippingService=new ShippingService();

        OrderFacade orderService=new OrderFacade(inventoryService,paymentService,shippingService);
        orderService.placeOrder("ItemABC","Account123",100.00);
    }
}
