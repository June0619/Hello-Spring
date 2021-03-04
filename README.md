# Hello-Spring

- 강의명 
    - 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술
<br><br>
<hr/>

## Memo

> <a>https://gist.github.com/ihoneymon/652be052a0727ad59601

> 21년 3월 7일까지 완강 예정

> build.gradle 에 dependency 추가 시 추가된 의존성이 프로젝트로 임포트 되지 않는 이슈가 있음.
> gradle refresh, project close 후 import 등 일반적으로 검색하면 나오는 해결 방법들은 거의
> 시도 해 보았으나 현재 해결이 되지 않음. 회사에서도, 집에서도 동일한 문제가 발견되는 걸로 봐서
> 설정상의 문제로 생각됨. 현재는 프로젝트 경로 제거 후 master branch 에서 clone 하는 방법으로
> 해결해서 진행중... 근본적인 원인은 계속해서 찾아보자.

<br>
<hr/>

### 섹션3. 회원 관리 예제 - 백엔드 개발
 - 익명클래스와 람다식<br>
 > <a>http://www.tcpschool.com/java/java_lambda_concept <br>

 - StreamAPI 

 - Optional 객체<br>
   - 따로 Optional 객체를 사용하지 않아도 null 여부 판별은 가능한데 왜 Optional 객체를 사용해주는 것인지 조사해보기<br>
 좋은 포스팅이 있으니 시간날 때 참고하도록 하자<br>
 > <a>https://www.daleseo.com/java8-optional-before/

 - Test Case <br>
   - Main Method, Controller 를 통한 테스트는 복잡한 기능이나 여러 기능을 한번에 테스트 하기에는
적합하지 않으므로, 반드시 테스트 케이스 작성이 필요함
   - 기능 개발 전에 테스트 케이스를 먼저 개발하고 기능을 해당 테스트 케이스를 통과할 수 있도록 개발하는 것이
TDD 방법론
   - 테스트 케이스는 보편적으로 given when then 파트로 구분하여 작성하면 편하다
   - 실무에서 실제 데이터가 오가는 비지니스 로직에 테스트 케이스를 어떻게 적용할지 고민해보기
   - assertThrows 메서드 복습

 - Intellij 단축키 <br>
   - Ctrl + Alt + Shift + T > Refactor 관련 기능 (이번 수업에서 사용한 것은 Extract Method) <br>
   - Ctrl + Alt + V > 자동으로 자료형에 맞게 변수에 할당 된다.

### 섹션4. 스프링 빈과 의존관계

 - Spring DI
   - Controller, Service, Repository 등의 어노테이션을 찾아 객체를 주입하는 것을 컴포넌트 스캔이라고 한다. 실제 위의 해당 어노테이션들은 @Component 어노테이션의 하위 어노테이션이다. 
   - 의존성 주입에는 생성자 주입, 필드 주입, setter 주입 세 가지 유형이 있다. (권장은 생성자 주입)
   
### 섹션5. 회원 관리 예제 - 웹 MVC 개발
   
### 섹션6. 스프링 DB 접근 기술

 - H2 DB
   - 간단한 테스트에 용이
   - 프로젝트 루트 경로에 DDL 관련 쿼리를 저장하는 디렉토리를 만들어 따로 관리한다.
   
- JDBC
   - 고전적인 방식으로 JDBC 를 이용하여 DB에 직접 쿼리를 송신하는 방식
   - Spring 환경에서 JDBC 를 이용하려면 DataSource 객체를 이용한다.
   - SOLID 원칙 중 O > OCP(Open-Closed Principle) 확장에는 열려있고, 수정에는 닫혀있다.
   - 스프링의 가장 큰 매력 : 기존 소스를 변경하지 않고 구현체를 변경하는 등 다형성면에서 유리
      - 상용 프로젝트에서 위의 이점을 활용하지 않고 작성했던 소스들을 분석해보고 반성하는 시간을 가지자...
   
- 스프링 통합테스트
   - @SpringBootTest Annotation 을 통해 DB 에 직접 연결하는 테스트 환경을 구축할 수 있다
   - @Transactional Annotation 이 DB 에 수행한 테스트를 테스트 종료 후 Rollback 해준다.
   - 이렇게 스프링 컨테이너까지 동반하는 테스트 환경을 통합테스트라고 하며 순수 자바 소스만 이용하여 실시하는
   테스트를 단위테스트라고 한다
   - 통합테스트보다는 최소단위로 실행할 수 있는 단위테스트가 좋은 테스트 설계일 확률이 더 높다.
    
- JDBC Template
    - 기능단위마다 Connection 을 생성하여 일일히 DB와 송수신 하는 번거로움을 줄이기 위해 사용
    - 하지만 쿼리는 직접 작성해야 한다
    - 자세한 사양은 공식문서를 참조해보자
    

   

   