# Import pandas
import pandas as pd
from pandas import ExcelWriter

data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

df = pd.DataFrame(data)
print(df)

writer = ExcelWriter("./activities/sample.xlsx")
df.to_excel(writer, sheet_name='Sheet1', index = False)

writer.close()

input_data = pd.read_excel("./activities/sample.xlsx", sheet_name='Sheet1')

print("shape: ",input_data.shape)
print("======= Dataframe Shape ======")
print("Rows: ",input_data.shape[0], "Columns: ", input_data.shape[1])

print("======= Emails Column ======")
print(input_data["Email"])

print("======= Sorted by FirstName =======")
print(input_data.sort_values(by="FirstName"))