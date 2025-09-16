# Settings
***
## Live Reload 설정
- Plugin 추가 (spring-boot-devtools)
- File > Settings > Build, Execution, Deployment > Compiler 에서 Build project automatically 체크
- Settings 창 > Advanced Settings > Allow auto-make to start even if developed application is currently running 체크
- Run/Debug Configurations > Modify options > On 'Update' action > Update classes and resources 선택
    - On 'Update' action > Update classes and resources 체크
    - On frame deactivation > Update classes and resources 체크

## 오픈 브라우저 설정 방법 
- File > Settings > Tools > Web Browsers
  - Default Browser > First listed -> Chrome

## swagger 설정
- build.gradle 의존성(dependencies) 추가
  - implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0'
- application.properties에 추가
  - springdoc.api-docs.path=/v3/api-docs
  - springdoc.swagger-ui.path=/swagger-ui.html
  - springdoc.swagger-ui.display-request-duration=true
  - springdoc.swagger-ui.doc-expansion=list
- api 별칭 설정 : Controller에 @Tag 어노테이션 추가
  - EX) @Tag(name = "User API", description = "회원 관련 API")
- 접속 url : http://localhost:8080/swagger-ui/index.html

## http 인코딩 설정
- application.properties에 추가
  - server.servlet.encoding.charset=UTF-8
  - server.servlet.encoding.enabled=true
  - server.servlet.encoding.force=true


***
# 면접 준비

## JAVA #[notion](https://www.notion.so/JAVA-24d506d4a4f380d88cb5dd30199e7fbd)
***
### 생성자
* [ConstructorClass.java](./src/main/java/com/example/interview/common/ConstructorClass.java)
### Overload vs Override
* [OverloadClass.java](./src/main/java/com/example/interview/common/OverloadClass.java)
* [OverrideClass.java](./src/main/java/com/example/interview/common/OverrideClass.java)
### 싱글톤
* [SingletonClass.java](./src/main/java/com/example/interview/common/SingletonClass.java)
### 추상클래스 vs interface
* [AbstractClass.java](./src/main/java/com/example/interview/common/AbstractClass.java)
* [InterfaceClass.java](./src/main/java/com/example/interview/common/InterfaceClass.java)
### 제네릭타입
* [GenericClass.java](./src/main/java/com/example/interview/common/GenericClass.java)
### try-with-resources
* [TryWithReourcesClass](./src/main/java/com/example/interview/common/TryWithReourcesClass.java)
### mvc(디자인 패턴)
* Model - VO [UserVO.java](./src/main/java/com/example/interview/Model/UserVO.java)
* Model - Service [UserServiceImpl.java](./src/main/java/com/example/interview/Service/UserServiceImpl.java)
* View - [signUp.html](./src/main/resources/static/user/signUp.html)
* Controller - [UserController.java](./src/main/java/com/example/interview/Controller/UserController.java)
### Garbage Collection
### 람다식(Stream)
### 영속성 콘텍스트(JPA)
### 쓰레드
***
## 자료구조
### String vs StringBuffer vs StringBuilder
* [StringClass](./src/main/java/com/example/interview/common/StringClass.java)
### Hash
* [HashClass](./src/main/java/com/example/interview/common/HashClass.java)
### Collection Framework
### Tree
***
## Spring
***
### Spring aop
### Spring DI(gradle, maven)
### 암호화 복호화
### 어노테이션
***

