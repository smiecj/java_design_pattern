package design.singleton.model;

import java.util.concurrent.atomic.AtomicInteger;

// 单例模式
// 售票器
public class TicketMaker {
    private AtomicInteger ticket;

    // 通过静态对象的方式实现单例
    private static TicketMaker maker = new TicketMaker();

    private TicketMaker() {
        this.ticket = new AtomicInteger(1000);
    }

    public int getTicketNum() {
        return this.ticket.getAndIncrement();
    }

    public static TicketMaker getInstance() {
        return maker;
    }
}
