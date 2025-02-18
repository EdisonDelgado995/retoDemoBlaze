#language: es
Característica: Compra en Demoblaze

 Escenario: Compra de productos en Demoblaze
    Dado que el 'usuario' visualiza el catálogo de Demoblaze
    Cuando se añade el producto de tipo 'Laptops' de referencia 'Sony vaio i7'
    Y se añade el producto de tipo 'Monitors' de referencia 'ASUS Full HD'
    Y se confirma la compra de los productos
    Entonces se recibe confirmación de la compra con valor '1020'
