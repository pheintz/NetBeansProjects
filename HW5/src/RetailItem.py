# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Lloyd"
__date__ = "$May 14, 2015 10:28:11 AM$"

class RetailItem(object):
    def __init__(self, description, unitsOnHand, price):
        self.description = description
        self.unitsOnHand = unitsOnHand
        self.price = price
        
    def printInfo(self):
        print("Item: " + self.description + "\nUnits: %i" % self.unitsOnHand)
        print("Price: $%i" % self.price)
        
    def decreaseUnitsOnHand(self):
        self.unitsOnHand -= 1
        
    def getPrice(self):
        return self.price
    
    
def main(argv=None):
    item = [RetailItem("Shoe", 5, 30), RetailItem("Shirt", 5, 12), RetailItem("Hat", 5, 15)]
    
    print("What item do you want?")
    for x in item:
        x.printInfo()
        
    choice = input("Item name(case sensitive): ")
    
    for x in item:
        if x.description == choice:
            x.decreaseUnitsOnHand()
            price = x.getPrice()
            price = price * 0.08 + price
            print("Price with tax: $%.2f" % price)
        

if __name__ == "__main__":
    main()
    exit()