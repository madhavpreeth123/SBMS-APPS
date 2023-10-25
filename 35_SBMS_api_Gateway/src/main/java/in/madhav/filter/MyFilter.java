package in.madhav.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("filter excuted...");
		ServerHttpRequest request=exchange.getRequest();
		
		HttpHeaders header=request.getHeaders();//headers info in key-value pair
		
		Set<String> keyset=header.keySet();
		for(String key:keyset) {
			System.out.print(key+"---");
			System.out.println(header.getValuesAsList(key));
		}
		return chain.filter(exchange);
	}
}
