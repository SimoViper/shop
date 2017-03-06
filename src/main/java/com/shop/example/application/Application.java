package com.shop.example.application;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.core.HazelcastInstance;
import com.shop.example.configuration.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages = "com.shop.example")
@EnableConfigurationProperties(Properties.class)
//@EnableCaching
public class Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


//    @Bean
//    public Config config() {
//        return new Config().addMapConfig(
//                new MapConfig()
//                        .setName("accepted-messages")
//                        .setEvictionPolicy(EvictionPolicy.LRU)
//                        .setTimeToLiveSeconds(2400));
//    }


/*    @Bean
    public ClientConfig client(){
        ClientConfig cc = new ClientConfig();
        cc.getNetworkConfig().addAddress("172.17.0.1:5701");
        return cc;

    }
    */
}
