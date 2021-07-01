# 🔮 LoveTest - 심리 테스트 앱 🔮
[Code with Joyce - 코틀린 3강으로 끝내기](https://youtu.be/M1e2tLnzVPo)를 보고 만든 간단한 심리 테스트 앱

## 🔎 Function
- 심리테스트 문제가 주어지고, 사용자가 선택한 문항에 따라 각각 다른 결과 출력
- Jetpack Navigation 라이브러리를 사용한 화면 이동

## 📸 Screenshots
<img src="https://user-images.githubusercontent.com/57751515/124102380-48236f80-da9b-11eb-9bf7-df533722f119.png" width="30%"><img src="https://user-images.githubusercontent.com/57751515/124103051-df88c280-da9b-11eb-8ceb-488f395147d7.png" width="30%"><img src="https://user-images.githubusercontent.com/57751515/124103113-eca5b180-da9b-11eb-9cb5-b5efc463326f.png" width="30%">
<img src="https://user-images.githubusercontent.com/57751515/124103230-0810bc80-da9c-11eb-83ed-aa693477ccd7.png" width="22.5%"><img src="https://user-images.githubusercontent.com/57751515/124103238-09da8000-da9c-11eb-9023-dfcd60e9f016.png" width="22.5%"><img src="https://user-images.githubusercontent.com/57751515/124103243-0b0bad00-da9c-11eb-987c-e3a7723fc85b.png" width="22.5%"><img src="https://user-images.githubusercontent.com/57751515/124103248-0c3cda00-da9c-11eb-8f8e-4736cc287465.png" width="22.5%">

## 🔧 App Version

targetSdkVersion 30 / minSdkVersion 19

## 📁 Project Structure
```
lovetest/
├─ fragment/
│  ├─ MainFragment.kt : 심리 테스트 시작 화면
│  ├─ QuestionFragment.kt : 심리 테스트 문제 화면
│  ├─ SelectionFragment.kt : 테스트 문항 선택 화면
│  └─ ResultFragment.kt : 문항 선택에 따른 결과 화면
├─ MainActivity.kt : navHostFragment와 navController를 연결
```

## 📚 Libraries

   - [Navigation](https://developer.android.com/guide/navigation) : Android Jetpack의 navigation 구성요소
