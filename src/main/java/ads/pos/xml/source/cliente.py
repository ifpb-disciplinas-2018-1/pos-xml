from zeep import Client
client = Client('http://localhost:8088/exemplo-ws/Calculadora?wsdl')
print(client.somar(1,3))
