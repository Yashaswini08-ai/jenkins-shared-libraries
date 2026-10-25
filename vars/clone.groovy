def call(String url, String branch){
  echo "This is cloning code"
              git url: "${url}",  git branch: "${branch}"
              echo "Code Cloning Successfull"
  }
