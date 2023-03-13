import React from "react";
import ProductList from "./ProductList";

function App() {
    const productList = [
        {
            price: 9999,
            name: 'Item 1',
            quantity: 0
        },
        {
            price: 999,
            name: 'Item 2',
            quantity: 0
        }
    ]
    
    return (
        
        <div>
            <ProductList productList = { ProductList } />
        </div>
    )
}

export default App