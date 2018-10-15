# メモ
## 作成方法
```shell
$ mkdir electron-helloworld && cd _
$ npm init -y
$ touch main.js index.html
// 実行
$ electron .
```


## Unable to find Electron app at ...と出て動かない
```package.json
+ "main": "main.js",
- "main": "index.js",
```

## ref
[https://qiita.com/gekkoukisi/items/169048df54855e75fe77]
[https://qiita.com/Quramy/items/a4be32769366cfe55778]
