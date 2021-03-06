package top.arkstack.shine.mq;

import org.springframework.amqp.support.converter.MessageConverter;
import top.arkstack.shine.mq.processor.Processor;

/**
 * @author 7le
 * @version 1.0.0
 */
public interface Factory {

    /**
     * 启动方法
     */
    void start();

    /**
     * 添加exchange和queue
     * 生产者创建队列不需要增加processor，消费者需要添加processor
     *
     * @param queueName     队列
     * @param exchangeName  交换器
     * @param routingKey    路由密钥
     * @param processor     处理器
     * @return
     */
    Factory add(String queueName, String exchangeName, String routingKey, Processor processor);

    /**
     * 添加exchange和queue
     * 生产者创建队列不需要增加processor，消费者需要添加processor
     *
     * @param queueName     队列
     * @param exchangeName  交换器
     * @param routingKey    路由密钥
     * @param processor     处理器
     * @param messageConverter  序列化处理器
     * @return
     */
    Factory add(String queueName, String exchangeName, String routingKey, Processor processor, MessageConverter messageConverter);
}
