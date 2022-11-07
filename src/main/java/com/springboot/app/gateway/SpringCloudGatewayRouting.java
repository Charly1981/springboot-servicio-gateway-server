/*
 * package com.springboot.app.gateway;
 * 
 * import org.springframework.cloud.gateway.route.RouteLocator; import
 * org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * @Configuration public class SpringCloudGatewayRouting {
 * 
 * @Bean public RouteLocator configureRoute(RouteLocatorBuilder builder) {
 * return builder.routes() //.route("productId",
 * r->r.path("/api/productos/**").uri("http://localhost:9009")) //static routing
 * .route("servicio-productos",
 * r->r.path("/api/productos/**").uri("lb://servicio-productos")) //dynamic
 * routing .build(); } }
 */