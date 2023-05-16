
In this example output, the *italic* text is input from the user, the normal text is output from the program. Note that your program does not actually need to talk to any payment processor etc., the command line output is enough.

# Example Program Output
Username: *Example Customer*
Address: *Exampleaddress 17, 10587 Berlin, Germany*
E-Mail: *test@example.com*

Welcome to the Shop, what do you want to do? (1) List all products, (2) Search for Products, (3) Add a product to the cart, (4) Checkout, (5) delete product from cart: *2*
Input a search term: *T-Shirt*
Here are all T-Shirt products:
T-Shirt[id=14567, name="Couch Potato Champion", price=18.75, weight=0.62kg, stockAmount=82, categories=[Clothing, T-Shirt, Cotton]]
T-Shirt[id=23901, name="Sarcasm Loading...Please Wait", price=12.99, weight=0.48kg, stockAmount=131, categories=[Clothing, T-Shirt, Cotton]]
T-Shirt[id=36458, name="I'd rather be sleeping", price=21.50, weight=0.58kg, stockAmount=78, categories=[Clothing, T-Shirt, Cotton]]
T-Shirt[id=48012, name="Nacho Average Dad", price=16.95, weight=0.55kg, stockAmount=105, categories=[Clothing, T-Shirt, Cotton]]
T-Shirt[id=56973, name="I'm not arguing, I'm just explaining why I'm always right", price=17.50, weight=0.5kg, stockAmount=92, categories=[Clothing, T-Shirt, Cotton]]

Welcome to the Shop, what do you want to do? (1) List all products, (2) Search for Products, (3) Add a product to the cart, (4) Checkout, (5) delete product from cart: *3*
Product ID: *14567*
Quantity: *2*
Your current cart is:
Cart[products={14567=2}]

Welcome to the Shop, what do you want to do? (1) List all products, (2) Search for Products, (3) Add a product to the cart, (4) Checkout, (5) delete product from cart: *2*
Input a search term: *MP3*
Here are all MP3 products:
MP3[id=74321, name="Retro Beats", price=8.99, categories=[Electronics, Music, MP3]]
MP3[id=84965, name="Relaxing Ocean Sounds", price=4.99, categories=[Electronics, Music, MP3, Meditation]]
MP3[id=93218, name="Meditation Melodies", price=6.99, categories=[Electronics, Music, MP3, Meditation]]
MP3[id=15789, name="90's Jams", price=5.99, categories=[Electronics, Music, MP3, Throwback]]
MP3[id=26844, name="Classical Favorites", price=9.99, categories=[Electronics, Music, MP3, Classical]]

Welcome to the Shop, what do you want to do? (1) List all products, (2) Search for Products, (3) Add a product to the cart, (4) Checkout, (5) delete product from cart: *3*
Product ID: *26844*
Quantity: *1*
Your current cart is:
Cart[products={14567=2, 26844=1}]

Welcome to the Shop, what do you want to do? (1) List all products, (2) Search for Products, (3) Add a product to the cart, (4) Checkout, (5) delete product from cart: *4*
The price of the products is 47,49.
The shipping of physical products costs 1,24 (1€ pro KG)
Total cost is 48,73
Do you want to continue (Y/n)? *Y*
Please enter your IBAN to charge: *DE69100900008841015003*
Telling payment processor to charge 48,73 from IBAN DE69100900008841015003 with Name Example Customer at Address Exampleaddress 17, 10587 Berlin, Germany...
Telling postal operator to send 2 of 14567 to Example Customer, Exampleaddress 17, 10587 Berlin, Germany...
Sending the Link to the digital download of 26844 to test@example.com...

Welcome to the Shop, what do you want to do? (1) List all products, (2) Search for Products, (3) Add a product to the cart, (4) Checkout, (5) delete product from cart: