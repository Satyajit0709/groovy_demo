def buildApp()
{
	echo 'Buildig the application from Script'
}

def testApp()
{
	echo 'Testing the application from Script'
}
def deployApp()
{
	echo 'Deploying the application from Script'
	echo "Version is ${version_choice}"
	echo "Parameter is ${ENV_PARAM}"
}