/*
 * 실행 순서
 * 1. 서버가 구동될 때 web.xml 파악
 * 2. web.xml에 있는 applicationContext.xml 과 dispatcher-servlet.xml을 확인
 * 3. dispatcher-servlet에 명시된 controller 패키지 찾아서 매핑.
 * 4. controller 내부 메서드 실행 ( 메소드에 따라서 prefix, suffix 적용시켜줌 )
 * */

/*
 * applicationContext.xml 의 역할
 * : dispatcher-servlet과는 달리 view와 관련되지 않은 객체를 정의한다.
 * : 비즈니스 로직(Service, Repository(DAO), DB)과 관련된 설정을 해준다
 * */

/*
 * servlet-context.xml 의 역할
 * : 요청과 관련된 객체 정의 (url과 관련된 controller나, @어노테이션, ViewResolver, Interceptor, MultipartResolver 등의 설정)
 * */


/*
*
POST
POST는 리소스의 생성을 담당한다.
POST는 요청 시 마다, 새로운 리소스가 생성된다.

PUT
PUT은 리소스의 생성과 수정을 담당한다.
PUT은 요청 시 마다, 같은 리소스를 반환한다

(patch : 일부분 수정, put: 전체수정)
*  */