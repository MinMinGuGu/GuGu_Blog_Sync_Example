package org.example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The type Config.
 *
 * @author minmin
 * @date 2023 /03/08
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties("example-config")
public class Config {
    private String value;
}
