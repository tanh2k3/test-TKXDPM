package VNPaySubsystem;

import Exception.InternalServerErrorException;
import Exception.InvalidDataErrorException;
import Exception.NotEnoughBalanceException;
import Model.Order;
import Model.PaymentTransaction;

public class VNPaySubsystem implements VNPayInterface {
    private VNPaySubsystemController controller;

    public VNPaySubsystem() {
        this.controller = new VNPaySubsystemController();
    }

    @Override
    public PaymentTransaction payOrder(Order order)
            throws InternalServerErrorException, InvalidDataErrorException, NotEnoughBalanceException {
        return controller.payOrder(order); // Gọi tới controller để thực hiện logic thanh toán
    }

    @Override
    public PaymentTransaction refund(Order order)
            throws InternalServerErrorException, InvalidDataErrorException, NotEnoughBalanceException {
        return controller.refund(order); // Gọi tới controller để thực hiện logic hoàn tiền
    }
}
