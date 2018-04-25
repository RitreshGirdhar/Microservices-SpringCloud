# Microservices-SpringCloud


Here i am giving you demo of ideal microservice architecture with running sample code.

# Components
	#1 Edge Services - Gateway -> ZUUL
	#2 Service Registry -> ServiceRegistry -> Eureka
	#3 Configuration -> Config -> Cloud Configuration.
	#4 Rest Apis -> MS1,MS2 -> Spring rest apis

# Gateway  
	* Currently , i am using ZUUL , once Spring cloud gateway get stable we move to that.
	* Gateway pointing to ServiceRegistry to discover the new microService in the environment
	* Gateway also point to Config to get the dynamic routing


# Service Registry 
	* Independent Service , i am using eureka here to manage registry.

# Config 
	* Independent Service 
	* The thing which are missing in this currently , git monitoring webhook will deploy it soon.
	* Currently config reading from ~/tmp/config git directory 


# MS1
	* Simple MicroService with 2 api /v1/ & /message
	* Registered with Eureka
	* pointing to cloud for fetching configuration
	* Zipkin enable for tracing, in log you can check track id & span id
	

# MS2
	* Simple MicroService with 1 api /v1/
	* Registered with Eureka
	* pointing to cloud for fetching configuration
	* Zipkin enable for tracing, in log you can check track id & span id

