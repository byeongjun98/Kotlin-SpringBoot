# kopring-boot-template

## 📝 프로젝트 소개
이 프로젝트는 Spring Boot와 Kotlin(Kopring)을 사용한 간단한 CRUD API 템플릿입니다. `Post` 엔티티에 대한 생성, 조회, 수정, 삭제 기능을 제공합니다.

## 🛠️ 기술 스택
- **언어**: Kotlin
- **프레임워크**: Spring Boot 3.5.6
- **빌드 도구**: Gradle
- **Java 버전**: 17
- **데이터베이스**: H2 (In-memory)

## ⚙️ 실행 방법
1. **프로젝트 클론**
   ```bash
   git clone https://github.com/byeongjun98/kopring-boot-template.git
   cd kopring-boot-template
   ```

2. **애플리케이션 실행**
   아래 명령어를 사용하여 애플리케이션을 실행합니다.
   ```bash
   ./gradlew bootRun
   ```
   애플리케이션이 실행되면 `http://localhost:8080`에서 접속할 수 있습니다.

3. **H2 데이터베이스 콘솔**
   애플리케이션 실행 후, 아래 주소로 접속하여 H2 데이터베이스 콘솔을 사용할 수 있습니다.
   - **URL**: `http://localhost:8080/h2-console`
   - **JDBC URL**: `jdbc:h2:mem:local`
   - **Username**: `test`
   - **Password**: (비워두세요)

## 🚀 API 명세
### 1. 모든 게시물 조회
- **Method**: `GET`
- **URL**: `/posts`
- **설명**: 모든 게시물 목록을 조회합니다.
- **요청 예시 (`curl`)**:
  ```bash
  curl -X GET http://localhost:8080/posts
  ```

### 2. 게시물 생성
- **Method**: `POST`
- **URL**: `/posts`
- **설명**: 새로운 게시물을 생성합니다.
- **요청 파라미터**:
  - `name` (String)
  - `age` (Int)
- **요청 예시 (`curl`)**:
  ```bash
  curl -X POST "http://localhost:8080/posts?name=JohnDoe&age=30"
  ```

### 3. 특정 게시물 조회
- **Method**: `GET`
- **URL**: `/posts/{id}`
- **설명**: 특정 ID의 게시물을 조회합니다.
- **요청 예시 (`curl`)**:
  ```bash
  curl -X GET http://localhost:8080/posts/1
  ```

### 4. 게시물 수정
- **Method**: `PUT`
- **URL**: `/posts/{id}`
- **설명**: 특정 ID의 게시물 정보를 수정합니다.
- **요청 파라미터**:
  - `name` (String)
  - `age` (Int)
- **요청 예시 (`curl`)**:
  ```bash
  curl -X PUT "http://localhost:8080/posts/1?name=JaneDoe&age=25"
  ```

### 5. 게시물 삭제
- **Method**: `DELETE`
- **URL**: `/posts/{id}`
- **설명**: 특정 ID의 게시물을 삭제합니다.
- **요청 예시 (`curl`)**:
  ```bash
  curl -X DELETE http://localhost:8080/posts/1
  ```
