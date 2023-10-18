package com.mjtal.common.product;


import com.mjtal.common.product.entity.BrandEntity;
import com.mjtal.common.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.File;
import java.util.UUID;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        ValueOperations<String, String> ops = redisTemplate.opsForValue();

        ops.set("hello","world_"+ UUID.randomUUID().toString());

        String hello = ops.get("hello");

        System.out.println(hello);
    }

//    @Autowired
////    OSSClient ossClient;
//
//    @Test
//    public void testUpload(){
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
////        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
////        String accessKeyId = "LTAI5tRtHpT4TfhxL7rYLaiq";
////        String accessKeySecret = "xZc6PefSKmuDncyhCvxnNRHlOD7mgx";
//        // 填写Bucket名称，例如examplebucket。
//        String bucketName = "gulimall-sichuan";
//        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//        String objectName = "test.jpg";
//        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
//        String filePath= "D:\\image\\test.jpg";
//
//        // 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        try {
//            // 创建PutObjectRequest对象。
//            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, new File(filePath));
//            // 如果需要上传时设置存储类型和访问权限，请参考以下示例代码。
//            // ObjectMetadata metadata = new ObjectMetadata();
//            // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
//            // metadata.setObjectAcl(CannedAccessControlList.Private);
//            // putObjectRequest.setMetadata(metadata);
//
//            // 上传文件。
//            ossClient.putObject(putObjectRequest);
//        } catch (OSSException oe) {
//            System.out.println("Caught an OSSException, which means your request made it to OSS, "
//                    + "but was rejected with an error response for some reason.");
//            System.out.println("Error Message:" + oe.getErrorMessage());
//            System.out.println("Error Code:" + oe.getErrorCode());
//            System.out.println("Request ID:" + oe.getRequestId());
//            System.out.println("Host ID:" + oe.getHostId());
//        } catch (ClientException ce) {
//            System.out.println("Caught an ClientException, which means the client encountered "
//                    + "a serious internal problem while trying to communicate with OSS, "
//                    + "such as not being able to access the network.");
//            System.out.println("Error Message:" + ce.getMessage());
//        } finally {
//            if (ossClient != null) {
//                ossClient.shutdown();
//            }
//        }
//    }

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("iphone");
        brandService.updateById(brandEntity);

    }

}
