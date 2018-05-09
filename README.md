# Microservices-SpringCloud


Here i am giving you demo of ideal microservice architecture with running sample code.

# Components
	* Edge Services - Gateway -> ZUUL
	* Service Registry -> ServiceRegistry -> Eureka
	* Configuration -> Config -> Cloud Configuration.
	* Rest Apis -> MS1,MS2 -> Spring rest apis


# Gateway  
	# Currently , i am using ZUUL , once Spring cloud gateway get stable we move to that.
	# Gateway pointing to ServiceRegistry to discover the new microService in the environment
	# Gateway also point to Config to get the dynamic routing


# Service Registry 
	# Independent Service , i am using eureka here to manage registry.

# Config 
	# Independent Service 
	# The thing which are missing in this currently , git monitoring webhook will deploy it soon.
	# Currently config reading from ~/tmp/config git directory 


# MS1
	# Simple MicroService with 2 api /v1/ & /message
	# Registered with Eureka
	# pointing to cloud for fetching configuration
	# Zipkin enable for tracing, in log you can check track id & span id

# MS2
	# Simple MicroService with 1 api /v1/
	# Registered with Eureka
	# pointing to cloud for fetching configuration
	# Zipkin enable for tracing, in log you can check track id & span id


# Trace & Monitoring
	# In each microservice sleuth is enable which help in tracing the request
	# and Zipkin Server is running on one instance and all microservice & gateway pointing to zipkin base url.

I have enable docker for easy deployment and maintainence.
You can find the docker images
https://store.docker.com/community/images/ritreshgirdhar/serviceregistry
https://store.docker.com/community/images/ritreshgirdhar/config
https://store.docker.com/community/images/ritreshgirdhar/ms1
https://store.docker.com/community/images/ritreshgirdhar/ms2
https://store.docker.com/community/images/ritreshgirdhar/ms3
https://store.docker.com/community/images/ritreshgirdhar/gateway

#Running Demo, (pardon if the below servers are down, as i am using them for another pocs.) 

* Eureka
	1. http://52.15.212.66:8761
* MS1
	1. http://13.59.166.163:9001/message
* MS2
	1. http://13.59.166.163:9002/v1
* ZUUL
	1. http://18.188.78.57:9000/ms1/v1
	2. http://18.188.78.57:9000/ms2/v1
* Zipkin 
	1. http://52.15.212.66:9411/zipkin/
