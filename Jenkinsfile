pipeline{

agent any

tools{

maven 'Maven'

}

stages{

stage('Checkout'){

steps{

git 'https://github.com/chinnagownishilpa/playwright-java-framework.git'

}

}

stage('Build'){

steps{

bat 'mvn clean test'

}

}

}

post{

always{

archiveArtifacts 'reports/**'

}

}

}