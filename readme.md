基础架构：
    Spring Boot + Spring Security Oauth2 + Mysql +　Redis
Mysql：存储 ClientDetails 和 UserDetails 认证信息
Redis：存储 AccessToken、RefreshToken、Authentication等凭证信息。
spring security 企业级应用安全架构.pdf[http://www.doc88.com/p-0671914829759.html]

spring boot 在于hibernate结合时，在启动时，偶尔会出现 PersistenceException：无法解析持久性单元根URL
更新到1.4.1