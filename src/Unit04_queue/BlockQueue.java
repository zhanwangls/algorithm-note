package Unit04_queue;

/**
 * 阻塞队列
 * 就是在队列基础上增加了阻塞操作。
 * 简单来说，就是在队列为空的时候，从队头取数据会被阻塞。因为此时还没有数据可取，直到队列中有了数据才能返回；
 * 如果队列已经满了，那么插入数据的操作就会被阻塞，直到队列中有空闲位置后再插入数据，然后再返回。
 * 因此，我们可以使用阻塞队列，轻松实现一个“生产者 - 消费者模型”！
 *
 * 这种基于阻塞队列实现的“生产者 - 消费者模型”，可以有效地协调生产和消费的速度。
 * 当“生产者”生产数据的速度过快，“消费者”来不及消费时，存储数据的队列很快就会满了。这个时候，生产者就阻塞等待，直到“消费者”消费了数据，“生产者”才会被唤醒继续“生产”。
 *
 * 基于阻塞队列，我们还可以通过协调“生产者”和“消费者”的个数，来提高数据的处理效率。
 * 比如，我们可以多配置几个“消费者”，来应对一个“生产者”。
 */
public class BlockQueue {

    // TODO

}
