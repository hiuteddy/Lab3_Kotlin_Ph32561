package com.example.lab3_ph32561

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.lab3_ph32561.ui.theme.Lab3_Ph32561Theme

class Bai5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3_Ph32561Theme {
                PaymentScreen()
            }
        }
    }
}

@Composable
fun PaymentScreen() {
    val paymentMethods = listOf(
        PaymentMethod(
            "PayPal",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/PayPal_logo.svg/512px-PayPal_logo.svg.png",
            Color(0xFFFF9800)
        ),
        PaymentMethod(
            "VISA",
            "https://th.bing.com/th?id=OSK.Z65rODOalSGrHhqJzos9uWhjxmeWUmF4898FOQYYfuI&w=102&h=102&c=7&o=6&dpr=1.3&pid=SANGAM",
            Color(
                0xFFFFFFFF
            )
        ),
        PaymentMethod(
            "Momo",
            "https://th.bing.com/th?id=OSK.9cKvJGIz_2DTZcjfo5inLIuzOBQCKGi80sZJ2stjtv4&w=102&h=102&o=6&dpr=1.3&pid=SANGAM",
            Color(
                0xFFE75385
            )
        ),
        PaymentMethod(
            "Zalo Pay",
            "https://th.bing.com/th?id=OIP.lNoymTv_hszSBF5R71chGwHaHa&w=250&h=250&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            Color(
                0xFF28A7E0
            )
        ),
        PaymentMethod(
            "Thanh toán trực tiếp",
            "https://news.nganluong.vn/wp-content/uploads/6-hinh-thuc-thanh-toan-truc-tuyen-o-viet-nam3.jpg",
            Color(0xFF00E676)
        )
    )

    val selectedMethod = remember { mutableStateOf("") }

    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF333333)) // Màu xám đậm sử dụng mã hex
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp) // Padding cho toàn bộ nội dung
            ) {
                Text(
                    text = "Thanh Toán",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 25.dp, bottom = 20.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(color = Color.White)
                )

                Text(
                    text = "Địa chỉ nhận hàng",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp)
                )

                Row(
                    modifier = Modifier.padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CoilImage(
                        data = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/No_image_available.svg/2048px-No_image_available.svg.png", // Thay "url_của_bạn" bằng đường dẫn URL thực của hình ảnh của bạn
                        contentDescription = "Location Icon",
                        modifier = Modifier.size(40.dp) // Điều chỉnh kích thước của hình ảnh theo nhu cầu
                    )
                    Text(
                        fontSize = 15.sp,
                        text = "Trí | 2222222\n22/333 đường Trung Mỹ Tây 1\nphường Tân Thới Nhất\nquận 12, Thành phố Hồ Chí Minh",
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Vui lòng chọn một trong những phương thức sau:",
                    color = Color.White,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(15.dp) // Padding cho toàn bộ nội dung
                ) {
                    paymentMethods.forEach { method ->
                        PaymentOption(
                            method = method,
                            isSelected = selectedMethod.value == method.name,
                            onSelect = { selectedMethod.value = method.name }
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Button(
                        onClick = { /* Handle button click */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF7043)),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 35.dp, start = 15.dp, end = 15.dp)
                    ) {
                        Text(
                            text = "Tiếp theo",
                            fontSize = 14.sp,
                            color = Color.White,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CoilImage(data: String, contentDescription: String, modifier: Modifier) {
    Image(
        painter = rememberImagePainter(data),
        contentDescription = contentDescription,
        modifier = modifier
    )
}

@Composable
fun PaymentOption(
    method: PaymentMethod,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, Color.Gray, RoundedCornerShape(10.dp))
            .background(color = method.color, shape = RoundedCornerShape(10.dp))
            .padding(20.dp)
            .height(36.dp) // Ensure consistent height
    ) {
        Image(
            painter = rememberImagePainter(data = method.imageUrl),
            contentDescription = method.name,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(50.dp) // Adjust size for visibility
                .padding(end = 16.dp) // Padding to separate image and text
        )
        Text(
            text = method.name,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically) // Canh giữa theo chiều dọc
                .padding(start = 80.dp) // Cách lề 30 dp
        )
        RadioButton(
            selected = isSelected,
            onClick = onSelect,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.Black
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Trang chủ") },
            label = { Text("Trang chủ", color = Color.White) },
            selected = false,
            onClick = { /* TODO: Handle navigation */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Lịch sử") },
            label = { Text("Lịch sử", color = Color.White) },
            selected = false,
            onClick = { /* TODO: Handle navigation */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.ShoppingCart, contentDescription = "Giỏ hàng") },
            label = { Text("Giỏ hàng", color = Color.White) },
            selected = true, // Item đang được chọn
            onClick = { /* TODO: Handle navigation */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "Hồ sơ") },
            label = { Text("Hồ sơ", color = Color.White) },
            selected = false,
            onClick = { /* TODO: Handle navigation */ }
        )
    }
}

data class PaymentMethod(
    val name: String,
    val imageUrl: String,
    val color: Color
)

@Preview(showBackground = true)
@Composable
fun PaymentScreenPreview() {
    Lab3_Ph32561Theme {
        PaymentScreen()
    }
}
