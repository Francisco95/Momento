# SpringBoot-Project-Momento

VGG-16을 활용한 이미지 분석 기반 두피와 모발 집중 케어 서비스 Mo:mento

## 프로젝트 소개

스페인어의 순간을 뜻하는 Momento를 이용하여 탈모는 한 순간이니 毛髮을 Mentoring 해준다는 뜻의 두피 케어 서비스

## 프로젝트 목적

- 쇼핑몰에서 싸게 구입할 수 있는 전자현미경으로 두피의 건강 상태를 체크할 수 있는 서비스 제공
- VGG-16으로 사진을 분석하여 비듬, 피지, 농포, 홍반, 각질, 탈모 총 6가지 질병을 각 0 ~ 3단계로 구분하여 분석하는 서비스 제공
- 검사 결과를 날짜별로 저장하고 레이더 차트로 시각화하여 비교해 볼 수 있는 서비스 제공
- 검사 결과를 바탕으로 병원 및 두피 케어 상품 등을 추천해주는 서비스 제공

## 개발 기간

- 2023-04-02 ~ 2023-05-10 (28일)

## 개발 인원

- 팀장 정윤재 - 문서 & 일정 관리, 화면 & DB 설계, 데이터 시각화
- 팀원 김정헌 - 화면 구현
- 팀원 이승주 - 데이터 수집 및 가공, AI 학습
- 팀원 최영복 - 기능 구현

## 개발 환경

- Java 8
- JDK 1.8.0
- IDE : STS 4.18.1
- Framework : Springboot 3.0.6
- Database : MYSQL
- ORM : Mybatis
- OS : LINUX(CentOS)
- Python 3.8
- Library : Pandas, Numpy, Pytorch, TenserFlow 등등
- Model : VGG-16
- Data : AI Hub

## 주요 기능 및 화면

**메인화면**

<details>
<summary>더보기</summary>

![메인](https://github.com/Francisco95/Momento/assets/77893146/26910197-a043-47ad-8e7b-aa5a1280b681)
</details>



**로그인**

- ID, Pwd 일치 확인
- ID, Pwd 찾기
- 로그인 세션 생성

<details>
<summary>더보기</summary>

![로그인](https://github.com/Francisco95/Momento/assets/77893146/ea2bc38c-0510-4470-a7fb-f835cb0c9c4b)
</details>



**회원가입**

- ID, Email 중복 체크

<details>
<summary>더보기</summary>
  
![회원가입](https://github.com/Francisco95/Momento/assets/77893146/a8e276d0-c206-4806-9bbb-526045590e21)
</details>



**두피검사**

- 이미지 첨부
- 이미지 가공 및 전처리
- AI를 이용한 두피 분석

<details>
<summary>더보기</summary>

![두피사진 업로드](https://github.com/Francisco95/Momento/assets/77893146/164e69f4-655d-443c-81fb-8a2c6068c875)
</details>



**두피검사결과**

- 두피 검사 결과 레이더 차트로 출력
- 크롤링을 이용한 결과에 따른 관련 상품 및 병원 추천
- 상품 검색 기능

<details>
<summary>더보기</summary>
  
![두피 확인 결과](https://github.com/Francisco95/Momento/assets/77893146/78415239-5ae9-4509-9eb6-bc4747996ca3)

![추천상품](https://github.com/Francisco95/Momento/assets/77893146/539aa8cc-7ca7-42ce-a599-50f9c44d66f2)
</details>



**마이페이지**

- 날짜별 검사 결과 레이더차트로 출력
- 특정 날짜 레이더차트 숨기기 및 보이게하기 기능
- 내가 사용중인 상품 목록 출력

<details>
<summary>더보기</summary>
  
![마이페이지](https://github.com/Francisco95/Momento/assets/77893146/06b81a8e-fd7b-43a8-930b-3d11751e606a)
</details>
