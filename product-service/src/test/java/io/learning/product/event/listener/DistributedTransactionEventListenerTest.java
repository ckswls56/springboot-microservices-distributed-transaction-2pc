package io.learning.product.event.listener;

import static org.mockito.Mockito.*;

import io.learning.core.domain.DistributedTransaction;
import io.learning.product.service.EventBus;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DistributedTransactionEventListenerTest {

    @Mock
    private EventBus eventBus;

    @InjectMocks
    private DistributedTransactionEventListener listener;

    @Test
    public void testOnMessage() {
        DistributedTransaction transaction = new DistributedTransaction();

        // 리스너가 메시지를 받을 때 동작을 확인
        listener.onMessage(transaction);

        // eventBus.sendTransaction 이 호출되었는지 검증
        verify(eventBus).sendTransaction(transaction);
    }
}
