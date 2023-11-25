# 마.미.타 (마이 미라클 타임)
<img src = "https://github.com/do-sopkathon-android-2/android-2-server/assets/79795051/79e4ece4-6e79-4cb6-983d-d6823ba1cd71.png" width = 400 />

당신만의 미라클 타임을 찾아드려요.

# 기술 스택

```
JDK 17
Spring 3.0.2
MySQL 8.0.32
```
# 실행 방법 
```
git clone https://github.com/do-sopkathon-android-2/android-2-server.git
cd android-2-server/sokathon-server
./gradlew build -x test
cd build/libs
java -jar [JAR 파일 이름]
```

# 패키지 구조
```java
└── 🗂️ src
    ├── 🗂️ main
    │   ├── 🗂️ java/org/sopt/sopkathonserver
    │   │               ├── 🗂️ common
    │   │               │   └── 🗂️ advice
    │   │               ├── 🗂️ controller
    │   │               │   └── 🗂️ dto
    │   │               │       ├── 🗂️ request
    │   │               │       └── 🗂️ response
    │   │               ├── 🗂️ domain
    │   │               │   └── 🗂️ enums
    │   │               ├── 🗂️ exception
    │   │               │   └── 🗂️ model
    │   │               ├── 🗂️ repository
    │   │               └── 🗂️ service
    │   └── 🗂️ resources
    └── 🗂️ test
```
# 팀원 소개
| 도소현  | 이나경|
|:----------|:----------|
|<img src = "https://github.com/do-sopkathon-android-2/android-2-server/assets/79795051/7f4d47dc-5f67-4348-92a5-554c480db53c.png" width = "250"/>| <img src = "https://github.com/do-sopkathon-android-2/android-2-server/assets/79795051/6da3c590-7d75-4e8e-8e16-32ba3917c66e.png" width = "250"/> |
|  DO SOPT 서버파트 OB | DO SOPT 서버파트 YB |

# Architecture
![image](https://github.com/do-sopkathon-android-2/android-2-server/assets/79795051/1a11b4a1-06d3-4313-b6b8-2f8d196b7140)

# Git Convention

### 📌 Issue

- To-do 당 1개의 이슈 생성

### 📌 Branch

- Git-Flow 전략
- `**main**` : 프로덕션용 브랜치 (배포 시 사용될 버전만 존재)
- `**develop**` : 개발 전용 브랜치
- `**이슈 기반 브랜치`**
    - 생성된 이슈 번호로 브랜치를 생성한다
    - 이슈번호 뒤에 `-해야 할 기능 요약` (자유롭게 정의)
    - feat/#{이슈번호}-aaa
    - ex. feat/#1-aaa,
    - ex. hotfix/#3-signin-password

```java
--------main--------
\
  --------feat/1-aaa------
\
 --------feat/2-aaa------
```

- PR이 Merge되면 해당 브랜치는 삭제한다.

### 📌 Commit convetion

#이슈번호 [feat] 커밋 내용 요약 블라블라

ex. #123 [feat] 로그인 구현

| tag | description |
| --- | --- |
| feat | 새로운 기능 추가 |
| fix | 자잘한 수정 |
| bugfix | 버그 수정 |
| refactor | 코드 리팩토링 시에만 사용 |
| chore | config 및 라이브러리, 빌드 관련 파일 수정 (프로덕션 코드 수정 x) |
| rename | 파일명, 변수명 수정 |
| docs | 문서 수정 |
| comment | 주석 추가 및 수정 |
| remove | 기능 삭제 및 파일 삭제 |
| test | 테스트 코드 작성 |
| !HOTFIX | hotfix |
- 최대한 관련 커밋 tag에 맞게 커밋 분리해서 push 하기

# Code Convention

### 📌 네이밍 규칙

- lowerCamelCase 사용
    - 클래스, 인터페이스, db스키마의 경우 Upper**CamelCase**
- 함수명 : 동사+명사
    - API와 직결되는 함수는 CRUD 명칭을 앞에 달기
        - ex. Create → create000
              Read → get000 (getUserById, getUsers)
              Update → update000
              Delete → delete000
- 변수명 : 명사+명사 or 형용사+명사
- 명사는 단수로 쓰지 않되 개수를 나타내는 단어 꼭 적어주기
    - ex. 복수 : getUsers() / 단수 : getUser()
    

### 📌  프로젝트 폴더링명

1. 폴더명
    - 소문자 사용
2. 패키지
    - controller
    - service
    - repository

### 📌  그 외 코드 작성 시 유의 사항

- Exception
    - 서비스 로직에 관련된 예외는 서비스 단에서 던지기
    - validation 관련 예외는 컨트롤러 단에서 던지기
- Type Assertion
    - type 지정 필수
        - 변수, 함수 모두
    - 서비스 단에서 스키마와 관련된 변수 및 함수 타입 단언은 경우의 따라 단언을 하지 않을 수 있다.
- 주석 작성 시 띄어쓰기 넣기
    
    ```java
    // 이렇게
    
    /**
     * 여기에 이렇게 합시다
     */
    ```
    

# **➡️ 코드 레이아웃**

### **들여쓰기 및 띄어쓰기**

- 들여쓰기에는 탭(tab) 대신 **4개의 space**를 사용합니다.
- 클래스 내 변수는 한 줄 공백을 두고 작성합니다.

### 줄바꿈

- 함수 정의가 `**최대 길이를 초과하는 경우**`에는 아래와 같이 줄바꿈합니다.
    
    ```java
    public static UserResponseDto of(Long id, String nickName, Rank userRank, int point, 
    																	int coupon, long interest, int waiting, int finish,
    																	int ready, int delivering, int delivered, 
    																	String address, String phoneNumber) {
    				...
        }
    }
    ```
    

### 함수 네이밍

**Dto명**

```
- Entity명 + Response or Request + Dto
ex) UserResponseDto
```

**메소드명**

```
- HTTPMethod + Entity명
ex) getUsers
```

### 서비스 클래스명

```
- Entity명 + Service
ex) UserSevice
```

### 컨트롤러 클래스명

```
- Entity명 + Controller
ex) UserController
```

그 외 모든 변수명은 **lowerCamelCase** 사용
