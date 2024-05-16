package com.example.lab3_ph32561

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
<<<<<<< HEAD
=======
import androidx.compose.foundation.magnifier
>>>>>>> 75cf113 (bài 5)
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
<<<<<<< HEAD
=======
import androidx.compose.ui.res.painterResource
>>>>>>> 75cf113 (bài 5)
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
<<<<<<< HEAD
        PaymentMethod("PayPal", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/PayPal_logo.svg/512px-PayPal_logo.svg.png", Color(0xFFFF9800)),
        PaymentMethod("VISA", "https://upload.wikimedia.org/wikipedia/commons/0/04/Visa.svg", Color(0xFF1434CB)),
        PaymentMethod("Momo", "https://upload.wikimedia.org/wikipedia/commons/3/3c/MoMo_Logo.png", Color(0xFFE91E63)),
        PaymentMethod("Zalo Pay", "https://upload.wikimedia.org/wikipedia/commons/7/7b/ZaloPay_Logo.png", Color(0xFF03A9F4)),
        PaymentMethod("Thanh toán trực tiếp", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Cash_icon.svg/1024px-Cash_icon.svg.png", Color(0xFF00E676))
    )

    val selectedMethod = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Thanh Toán",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Địa chỉ nhận hàng",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = "Trí | 2222222\n22/333 đường Trung Mỹ Tây 1\nphường Tân Thới Nhất\nquận 12, Thành phố Hồ Chí Minh",
            color = Color.White,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Vui lòng chọn một trong những phương thức sau:",
            color = Color.White,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

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
                .padding(16.dp)
        ) {
            Text(
                text = "Tiếp theo",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }

=======
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
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF221919)) // Màu xám đậm sử dụng mã hex
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp) // Padding cho toàn bộ nội dung


        ) {
            Text(
                text = "Thanh Toán",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 10.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))
            Spacer(modifier = Modifier.height(4.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color.White)
            )

            Text(
                text = "Địa chỉ nhận hàng",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp, start = 6.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.padding(horizontal = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            )

            {
                CoilImage(
                    data = "https://cdn-icons-png.flaticon.com/128/684/684908.png", // Thay "url_của_bạn" bằng đường dẫn URL thực của hình ảnh của bạn
                    contentDescription = "Your Image Description",
                    modifier = Modifier.size(40.dp) // Điều chỉnh kích thước của hình ảnh theo nhu cầu
                )
                Text(
                    fontSize = 14.sp,
                    text = "Trí | 2222222\n22/333 đường Trung Mỹ Tây 1\nphường Tân Thới Nhất\nquận 12, Thành phố Hồ Chí Minh",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }



            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "Vui lòng chọn một trong những phương thức sau:",
                color = Color.White,
                fontSize = 14.sp,
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
                        .padding(10.dp)
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
>>>>>>> 75cf113 (bài 5)
    }
}

@Composable
<<<<<<< HEAD
=======
fun CoilImage(data: String, contentDescription: String, modifier: Modifier) {
    Image(
        painter = rememberImagePainter(data),
        contentDescription = contentDescription,
        modifier = modifier
    )
}


@Composable
>>>>>>> 75cf113 (bài 5)
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
<<<<<<< HEAD
            .padding(16.dp)
            .height(35.dp) // 3Ensure consistent height
=======
            .padding(20.dp)
            .height(33.dp) // 3Ensure consistent height
>>>>>>> 75cf113 (bài 5)
    ) {
        Image(
            painter = rememberImagePainter(data = method.imageUrl),
            contentDescription = method.name,
            contentScale = ContentScale.Fit,
            modifier = Modifier
<<<<<<< HEAD
                .size(40.dp) // Adjust size for visibility
=======
                .size(50.dp) // Adjust size for visibility
>>>>>>> 75cf113 (bài 5)
                .padding(end = 16.dp) // Padding to separate image and text
        )
        Text(
            text = method.name,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically) // Canh giữa theo chiều dọc
                .padding(start = 80.dp), // Cách lề 30 dp

<<<<<<< HEAD
            )
=======
        )
>>>>>>> 75cf113 (bài 5)
        RadioButton(
            selected = isSelected,
            onClick = onSelect,
            modifier = Modifier.align(Alignment.CenterVertically)
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