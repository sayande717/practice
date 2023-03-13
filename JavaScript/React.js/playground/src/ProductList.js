import React from "react";
import Product from './Product';

function ProductList(props) {
    return (
        props.ProductList.map((product,index) => {
            return < Product product = {product} key={index}/>
        })
    )
}

export default ProductList