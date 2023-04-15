pipeline{

agent any
stages{

stage('Checkout'){
steps{
git branch: "main", url: 'https://github.com/sangeetaPalankar/Mockinterview.git'
}

}

stage('Build'){
steps{
sh 'chmod a+x mvnw'
sh './mvnw clean package -DskipTests=true' 
			}
			
			post{
				always{
					archiveArtifacts 'target/*.jar'
				}
			}
		}
		
		stage(DockerBuild){
			steps{
				sh 'docker build -t sangeetapalankar/rushi:demo1 .'
			}
		}
		stage('Login') {

steps {

sh 'echo sangita@061 | docker login -u sangeetapalankar --password-stdin'

}

}

stage('Push') {

steps {

sh 'docker push sangeetapalankar/rushi'

}

}

}

post {

always {

sh 'docker logout'

}
	}
}


