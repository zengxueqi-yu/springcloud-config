### SpringCloud的分布式配置中心测试项目
- 项目名：springcloud-config

### sevice-server
- 服务注册中心，为配置中心提供服务注册

### cloud-server
- 配置中心服务，从配置库读取配置文件信息，把服务注册到服务注册中心

### cloud-client
- 配置服务客户端，注册服务到服务注册中心，通过服务注册中心调用配置服务接口，
再通过配置服务读取配置库中的配置文件信息