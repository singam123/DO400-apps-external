pipeline{
    agent any
    stages{
        stage('Checkout git'){
            steps{
                git branch: 'main', url: 'https://github.com/RedHatTraining/DO400-apps'
            }
        }
    }
}


String person = 'Singam'
def anotherPerson = 'Reddy'
node {
    stage('hello'){
        hello(person,anotherPerson)
     }
}

def hello(person1,person2){
    echo "Hello ${person1} and ${person2}"
}

pipeline{
    agent any
    stages{
        stage('Hello'){
            steps{
                script{
                    def people = ['Singam','Reddy']
                    for (int i=0;i < people.size();i++){
                        echo "Hello ${people[i]}"
                    }
                }
            }
        }
    }
}