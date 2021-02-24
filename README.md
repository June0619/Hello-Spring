# Hello-Spring

- 강의명 
    - 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술
<br><br>
<hr/>

## Memo

> <a>https://gist.github.com/ihoneymon/652be052a0727ad59601

> 21년 3월 2일까지 완강 예정

<br>
<hr/>

### 섹션3. 회원 관리 예제 - 백엔드 개발
> - 익명클래스와 람다식<br>
> <a>http://www.tcpschool.com/java/java_lambda_concept <br>

> - StreamAPI 

> - Optional 객체<br>
> 따로 Optional 객체를 사용하지 않아도 null 여부 판별은 가능한데 왜 Optional 객체를 사용해주는 것인지 조사해보기<br>
> 좋은 포스팅이 있으니 시간날 때 참고하도록 하자<br>
> <a>https://www.daleseo.com/java8-optional-before/

> ####Test Case <br>
> - Main Method, Controller 를 통한 테스트는 복잡한 기능이나 여러 기능을 한번에 테스트 하기에는
적합하지 않으므로, 반드시 테스트 케이스 작성이 필요함
> - 기능 개발 전에 테스트 케이스를 먼저 개발하고 기능을 해당 테스트 케이스를 통과할 수 있도록 개발하는 것이
TDD 방법론
> - 테스트 케이스는 보편적으로 given when then 파트로 구분하여 작성하면 편하다
> - 실무에서 실제 데이터가 오가는 비지니스 로직에 테스트 케이스를 어떻게 적용할지 고민해보기
> - assertThrows 메서드 복습

> ####Intellij 단축키 <br>
> Ctrl + Alt + Shift + T > Refactor 관련 기능 (이번 수업에서 사용한 것은 Extract Method) <br>
> Ctrl + Alt + V > 자동으로 자료형에 맞게 변수에 할당 된다.