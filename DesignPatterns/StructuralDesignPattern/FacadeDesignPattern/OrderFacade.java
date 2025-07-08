package DesignPatterns.StructuralDesignPattern.FacadeDesignPattern;

public class OrderFacade {
    InventoryService inventoryService;
    PaymentService paymentService;
    ShippingService shippingService;

    public OrderFacade(InventoryService inventoryService,PaymentService paymentService,ShippingService shippingService){
        this.inventoryService=inventoryService;
        this.paymentService=paymentService;
        this.shippingService=shippingService;
    }

    public void placeOrder(String itemId,String accountId,double amount){
        inventoryService.checkStock(itemId);
        paymentService.makePayment(accountId, amount);
        shippingService.shipItem(itemId);
    }
}
