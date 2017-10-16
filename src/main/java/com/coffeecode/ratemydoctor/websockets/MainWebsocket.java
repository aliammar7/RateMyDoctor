//package com.coffeecode.ratemydoctor.websockets;
//
//import com.coffeecode.ratemydoctor.facade.DoctorFacade;
//import com.coffeecode.ratemydoctor.models.Doctor;
//import io.reactivex.Observer;
//import io.reactivex.disposables.Disposable;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.inject.New;
//import javax.inject.Inject;
//import javax.websocket.*;
//import javax.websocket.server.ServerEndpoint;
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.Collections;
//import java.util.List;
//import java.util.Set;
//
///**
// * Created by Ammar on 9/23/17.
// */
//@ApplicationScoped
//@ServerEndpoint("/actions")
//public class MainWebsocket implements Serializable{
//
//   private Set<Session> users= Collections.emptySet();
//
//    @Inject
//    DoctorFacade facade;
//
//    @OnOpen
//    public void open(Session s){
////        users.add(s);
////        facade.findDoctors().subscribe(new Observer<Doctor>() {
////            @Override
////            public void onSubscribe(Disposable d) {
////
////            }
////
////            @Override
////            public void onNext(Doctor doctor) {
////                users.stream().forEach(e -> {
////                    try {
////                        e.getBasicRemote().sendText(doctor.getName());
////                    } catch (IOException e1) {
////                        e1.printStackTrace();
////                    }
////                });
////
////            }
////
////            @Override
////            public void onError(Throwable e) {
////
////            }
////
////            @Override
////            public void onComplete() {
////
////            }
////        });
//    }
//
//
//
//    @OnClose
//        public void close(Session session) {
//    }
//
//    @OnError
//        public void onError(Throwable error) {
//    }
//
//    @OnMessage
//        public void handleMessage(String message, Session session) {
//        System.out.println(message);
//    }
//}
