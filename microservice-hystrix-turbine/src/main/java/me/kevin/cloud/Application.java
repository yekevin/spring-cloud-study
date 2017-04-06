package me.kevin.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Kevin
 * @description
 * 在复杂的分布式系统中，相同服务的节点经常需要部署上百甚至上千个，
 * 很多时候，运维人员希望能够把相同服务的节点状态以一个整体集群的形式展现出来，
 * 这样可以更好的把握整个系统的状态。 为此，Netflix提供了一个开源项目（Turbine）
 * 来提供把多个hystrix.stream的内容聚合为一个数据源供Dashboard展示。
 * @date 2017/4/6
 */
@SpringBootApplication
@EnableTurbine
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
