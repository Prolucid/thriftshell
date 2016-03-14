package com.prolucid.thriftshell;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import backtype.storm.multilang.SpoutMsg;
import backtype.storm.task.TopologyContext;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import org.junit.*;

public class ThriftSerializerTest {
    ThriftSerializer serializer = new ThriftSerializer();
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testConnect() {
    }

    @Test
    public void testReadShellMsg() {
    }

    @Test
    public void testWriteBoltMsg() {
       // fail("Not yet implemented");
    }

    @Test
    public void testWriteSpoutMsg() {
    }

    @Test
    public void testWriteTaskIds() {
      //  fail("Not yet implemented");
    }

}
