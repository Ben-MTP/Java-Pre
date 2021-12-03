## Creater Project Java SOAP Function
	Project có các chức năng:
		Additional
		Substraction
		Multiplication
		Division
		

## Các bước tạo project
	Bước 1: Tọa project Java thuần
	
	Bước 2: Tạo package + class
		+ Tạo Class Interface FunctionService
		+ Tạo Class FunctionServiceImp -> triển khai lại các phương thức của Interface.
		
	Bước 3: Class Main -> triển khai các Endpoint + publish connection.
	

## Bước Running Project
	1. Export Project ra file jar
	
	2. Chạy file jar
	File jar được đặt trong đường dẫn:
		../Java-Soap-Function\export
	Command line
		java -cp soap-function.jar com.manhkm.SoapPublisher
		java -jar soap-function.jar com.manhkm.SoapPublisher
