
Prometheus:
docker run -d --name=prometheus -p 8080:8080 -v <PATH_FOR_PROMETHEUS_XML_FILE/prometheus.yml>:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml

Grafana:
docker run -d --name=grafana -p 3000:3000 grafana/grafana



	
URLs:
For all actuator links:
http://localhost:8080/actuator

For Prometheus :
http://localhost:8080/actuator/prometheus

Sample API:
http://localhost:8080/hello

Sample API with random delays to show variation in on Grafana
http://localhost:8080/waitforhello


Screenshots:
1. Prometheus dashboard with cpu usage:
![prometheus_run](./src/main/resources/images/prometheus_run.png)

2. Rate of fire of /hello API : 
![rate_of_fire](./src/main/resources/images/rate_of_fire.png)

3. CPU usage:
![cpu_usage](./src/main/resources/images/cpu_usage.png)

4. jvm memory usage:
![jvm_memory_usage](./src/main/resources/images/jvm_memory_usage.png)


