学习 Spring Boot

搭建一个基本的开发框架

注意：
1. 返回 JSON 类型结果时使用统一结果类`ResultBean`
1. 系统处理出错时，抛出统一的异常`ProcessException`,由统一异常处理器进行处理
2. 数据库操作时不要忘记使用事物注解
3. 分页查询时使用 MyBatis 的分页查询插件
