## Hi there 👋
# 학사 관리 서비스 
#  학사 - 학생


학사 사이트에 가입을 하여 
학생의 가입 유무 확인 및 회원탈퇴 기능,

추가로 게시글 사이트에서 다양한 기능을 사용할 수 있도록 작성하였음.

주요 기능 


1) 학과 사이트 : 회원가입 / 로그인 및 로그아웃/ 회원 탈퇴

2) 게시글 작성 : 글 작성/등록/삭제 /학과 태그 등록/검색/삭제





<img src="https://github.com/user-attachments/assets/35fb6305-48dc-41bb-8596-47b517c98957" width="500" height="300"/>


# API 설계
## 학과 사이트
회원가입 :   ***POST /api/v1/users***
	***{ 
	  "username" : "studentID", 
	  "password" : "password123", 
  	  "email" : "student123@example.com" 
	}***

특정 학생 조회 :   ***GET /users{id}***

학생 목록 조회 :  ***GET /users***

학생 아이디 로그인 : *  **POST /api/v1/auth/login***

***{ 
  "username": "studentID", 
  "password": "password123"
}***

학생 아이디 로그아웃 :   ***POST /api/v1/auth/logout***

학생 아이디 회원탈퇴 :   *******DELETE /api/v1/users/{userId}*******
# 게시판

게시글 작성 : ***POST /api/v1/posts***

***{ 
  "title": "게시글 제목", 
  "content": "게시글 내용", 
  "tags": ["컴퓨터공학", "학과이벤트"] 
}***

게시글 조회 : ***GET /api/v1/posts/{postId}***

***{ 
  "id": 123, 
  "title": "게시글 제목", 
  "content": "게시글 내용", 
  "tags": ["컴퓨터공학", "학과이벤트"], 
  "createdAt": "2024-10-08T10:15:30", 
  "author": "user123" '
}***

게시글 수정 : ***PUT /api/v1/posts/{postId}***

게시글 삭제 : ***DELETE /api/v1/posts/{postId}***









## 태그
태그 등록 : POST /api/v1/tags


***{ 
  "tagName": "컴퓨터공학"
 }***

태그 검색 : -   ***GET /api/v1/tags?name={tagName}***

***[ 
{ "id": 1, 
"tagName": "컴퓨터공학"
 }, 
{ "id": 2, 
"tagName": "인공지능" 
}
 ]***

태그 삭제 : ***DELETE /api/v1/tags/{tagId}***

<!--
**Jak-Sho/Jak-Sho** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->
