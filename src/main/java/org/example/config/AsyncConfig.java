package org.example.config;

import org.springframework.boot.task.TaskExecutorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.time.Duration;

/**
 * The type Async config.
 *
 * @author minmin
 * @date 2023 /03/31
 */
@EnableAsync
@Configuration
public class AsyncConfig {
    /**
     * Sync event thread pool thread pool task executor.
     *
     * @return the thread pool task executor
     */
    @Bean
    public ThreadPoolTaskExecutor syncEventThreadPool() {
        return new TaskExecutorBuilder()
                .corePoolSize(0)
                .maxPoolSize(Integer.MAX_VALUE)
                .keepAlive(Duration.ofSeconds(30))
                .queueCapacity(0)
                .threadNamePrefix("syncEventThreadPool-")
                .build();
    }
}
